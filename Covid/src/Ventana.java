import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Ventana {
    private AnchorPane pane;
    private Vacuna arregloVacuna[]=new Vacuna[5];
    private Persona arregloPersona[]=new Persona[5];
    private int cont=0;
    public Vacuna vacuna;
    public Persona persona;
    public AnchorPane construir(){
    this.pane=new AnchorPane();
        Label t1=new Label("Vacuna"); t1.setFont(new Font("Arial",30)); t1.setTextFill(Color.web("#333")); t1.setLayoutX(10); t1.setLayoutY(10);

        Label lblNombre=new Label("Nombre Vacuna"); lblNombre.setLayoutX(10); lblNombre.setLayoutY(50);
        TextField txtNombre=new TextField(); txtNombre.setPrefSize(150,25); txtNombre.setLayoutX(10); txtNombre.setLayoutY(70);

        Label lblMarca=new Label("Marca vacuna"); lblMarca.setLayoutX(180); lblMarca.setLayoutY(50);
        TextField txtMarca=new TextField(); txtMarca.setPrefSize(150,25); txtMarca.setLayoutX(180); txtMarca.setLayoutY(70);

        Label lblDosis=new Label("No. dosis"); lblDosis.setLayoutX(340); lblDosis.setLayoutY(50);
        TextField txtDosis=new TextField(); txtDosis.setPrefSize(150,25); txtDosis.setLayoutX(340); txtDosis.setLayoutY(70);

        Button btnInsertarV=new Button("Insertar"); btnInsertarV.setPrefSize(80,25); btnInsertarV.setLayoutX(500); btnInsertarV.setLayoutY(70);

        ListView listaVacunas=new ListView(); listaVacunas.setPrefSize(330,250); listaVacunas.setLayoutX(10); listaVacunas.setLayoutY(120);
        ListView listaPersonas=new ListView(); listaPersonas.setPrefSize(330,250); listaPersonas.setLayoutX(10); listaPersonas.setLayoutY(400);

        Label lblNombrePersona=new Label("Nombre de la persona: "); lblNombrePersona.setLayoutX(350); lblNombrePersona.setLayoutY(120);
        TextField txtNombrePersona=new TextField(); txtNombrePersona.setPrefSize(220,25); txtNombrePersona.setLayoutX(350); txtNombrePersona.setLayoutY(150);

        Label lblCurp=new Label("CURP: "); lblCurp.setLayoutX(350); lblCurp.setLayoutY(190);
        TextField txtCurp=new TextField(); txtCurp.setPrefSize(220,25); txtCurp.setLayoutX(350); txtCurp.setLayoutY(210);

        Label lblCombo=new Label("Sexo: "); lblCombo.setLayoutX(350); lblCombo.setLayoutY(245);
        ComboBox combo=new ComboBox();
        combo.getItems().addAll("Hombre","Mujer","Hombre trans","Mujer trans","No binario","Otro");
        combo.setPrefSize(220,25); combo.setLayoutX(350); combo.setLayoutY(265);
        Button btnInsertarP=new Button("Insertar"); btnInsertarP.setPrefSize(80,25); btnInsertarP.setLayoutX(350); btnInsertarP.setLayoutY(320);
        Button btnDetalles=new Button("Mostrar detalles"); btnDetalles.setPrefSize(120,25); btnDetalles.setLayoutX(350); btnDetalles.setLayoutY(350);

        this.pane.getChildren().addAll(t1,lblNombre,txtNombre,lblMarca,txtMarca,lblDosis,txtDosis,btnInsertarV,listaVacunas, lblNombrePersona,txtNombrePersona,lblCurp,txtCurp,lblCombo,combo,btnInsertarP,listaPersonas,btnDetalles);

        //Evento pa'l boton
        btnInsertarV.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String nombreVacuna=txtNombre.getText();
                String marcaVacuna=txtMarca.getText();
                String numeroDosis=txtDosis.getText();
                if(nombreVacuna.equals("") || marcaVacuna.equals("") || numeroDosis.equals("")){
                    launchError("Por favor, rellena todos los campos");
                }else{
                    try{
                        int convertir=Integer.parseInt(numeroDosis);
                        vacuna=new Vacuna(nombreVacuna,marcaVacuna,convertir);
                        arregloVacuna[cont]=vacuna;
                        cont++;
                        launchSuccess("Vacuna registrada exitósamente");
                        txtDosis.setText("");
                        txtNombre.setText("");
                        txtMarca.setText("");
                        listaVacunas.getItems().addAll(vacuna.getNombre());
                    }catch(NumberFormatException error){
                        launchError("Número no válido");
                    }catch(ArrayIndexOutOfBoundsException error){
                        launchError("No se aceptan más registros");
                    }catch (Exception error){
                        launchError("Ocurrió un error inesperado");
                    }


                }//Llave else
            }//llave evento
        });
        btnInsertarP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             String sex=combo.getSelectionModel().getSelectedItem().toString();
             int pos= listaVacunas.getSelectionModel().getSelectedIndex();
                System.out.println(sex+", "+arregloVacuna[pos].getNumeroDosis()+" dosis");
                String nombrePersona=txtNombrePersona.getText();
                String curp=txtCurp.getText();
                if(nombrePersona.equals("")||curp.equals("")||sex.equals("")){
                    launchError("Por favor, rellena todos los campos");
                }else{
                    try{
                        persona=new Persona(nombrePersona,curp,sex);
                        launchSuccess("Persona registrada correctamente");
                        txtNombrePersona.setText("");
                        txtCurp.setText("");
                        listaPersonas.getItems().addAll(persona.getNombre()+", "+persona.getCurp());
                    }catch (Exception error){
                        launchError("Ocurrió un error inesperado");
                    }//catch
                }//else
            }//evento
        });
        btnDetalles.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    String sex = combo.getSelectionModel().getSelectedItem().toString();
                    int pos = listaPersonas.getSelectionModel().getSelectedIndex();
                    launchSuccess("Datos registrados: \n" +
                            "Nombre: " + persona.getNombre() + "\n" +
                            "CURP: " + persona.getCurp() + "\n" +
                            "Sexo: " + sex + "\n" +
                            "Vacuna: "+vacuna.getNombre()+"\n" +
                            "Marca de la vacuna: "+vacuna.getMarcaVacuna()+"\n" +
                            "Número de dosis: "+vacuna.getNumeroDosis()+"\n");
                }catch (Exception error){
                    launchError("Ocurrió un error inesperado");
                }//catch

            }
        });
        return pane;
    }
        public void launchError(String mensaje){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText(mensaje);
            alert.show();
        }
    public void launchSuccess(String mensaje){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Todo correcto");
        alert.setContentText(mensaje);
        alert.show();
    }
}
