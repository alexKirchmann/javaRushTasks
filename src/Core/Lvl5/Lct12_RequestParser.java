package Core.Lvl5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Lct12_RequestParser {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a= reader.readLine();
        a=a.substring(a.indexOf('?')+1);
        String[] lines=a.split("&");
        HashMap<String,String> finaly =new HashMap<>();
        String key, value;
        for (int i=0; i<lines.length;i++){
            if (lines[i].contains("=")){
                key=lines[i].substring(0,lines[i].indexOf('='));
                value=lines[i].substring(lines[i].indexOf('=')+1);
            }
            else {
                key=lines[i];
                value=null;
            }
            if (i<lines.length-1)
                System.out.print(key+" ");
            else System.out.println(key);
            finaly.put(key, value);
        }
        for (Map.Entry entry:finaly.entrySet()) {
            if (entry.getKey().equals("obj")){
                Double doub1;
                String strv1;
                try {
                    doub1=Double.parseDouble(entry.getValue().toString());
                    alert(doub1);
                }
                catch(Exception e){
                    strv1=entry.getValue().toString();
                    alert(strv1);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.print("String: "+value);
    }
}

