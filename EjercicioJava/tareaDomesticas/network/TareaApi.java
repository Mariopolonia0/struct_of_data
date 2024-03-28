package EjercicioJava.tareaDomesticas.network;

import EjercicioJava.tareaDomesticas.data.Tarea;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;



public class TareaApi  {
    List<Tarea> tareasApi = new ArrayList<Tarea>();
    public TareaApi() {

    }

    public void getTareas(){
        try{
            URL url = new  URL("https://gestordomestico.somee.com/api/Tareas");
            InputStream is = url.openStream();
            //JsonReader rdr=Json.createReader(new InputStreamReader(is, "UTF-8"));
//            JsonArray results= rdr.readArray();
//            Iterator<?> iterator = results.iterator();
//            while(iterator.hasNext()){
//                JsonObject jsonObject = (JsonObject) iterator.next();
//                System.out.println("JSON-> El id es: "+jsonObject.get("id").toString().toUpperCase()+", el nombre es: "+jsonObject.get("nombre").toString().toUpperCase()+", el puesto es: "+jsonObject.get("puesto").toString().toUpperCase());
//            }
        }catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }


}
