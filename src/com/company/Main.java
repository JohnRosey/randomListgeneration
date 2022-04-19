package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.sun.tools.javac.util.Constants.format;

public class Main {
    public static void Erase(String Filepath){

        File filepath= new File(Filepath);

        try{
            if(!filepath.exists()) {
                final var newFile = filepath.createNewFile();
            }
            FileWriter fileWriter= new FileWriter(filepath);
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        Erase("test.txt");
	// create new text file and write some text to it and then read it
    File file = new File("test.txt");
    file.createNewFile();


    FileWriter fw = new FileWriter(file);


        ArrayList<String> NameAppSource = new ArrayList<>();
        ArrayList<String> NameAppDest = new ArrayList<>();
        ArrayList<String> TypeTrans = new ArrayList<>();


        NameAppSource.add("Facebook.exe");
        NameAppSource.add("Twitter.exe");
        NameAppSource.add("Instagram.exe");
        NameAppSource.add("Snapchat.exe");
        NameAppSource.add("Whatsapp.exe");
        NameAppSource.add("Google.exe");
        NameAppSource.add("Youtube.exe");
        NameAppSource.add("Linkedin.exe");
        NameAppSource.add("Gmail.exe");
        NameAppSource.add("Microsoft.exe");
        NameAppSource.add("Amazon.exe");
        NameAppSource.add("Google.exe");


        Collections.shuffle(NameAppSource);


        NameAppDest.add("Ads.exe");
        NameAppDest.add("Firebase.exe");
        NameAppDest.add("Ads.exe");
        NameAppDest.add("Firebase.exe");
        NameAppDest.add("reddit.exe");
        NameAppDest.add("Pintrest.exe");
        NameAppDest.add("Walmart.exe");
        NameAppDest.add("Costco.exe");
        NameAppDest.add("Target.exe");
        NameAppDest.add("Ebay.exe");
        NameAppDest.add("AWS.exe");
        NameAppDest.add("MongoDB.exe");


        Collections.shuffle(NameAppDest);
        Map<String, String> data = new HashMap<String, String>();

        data.put("Computer"," is send");
        data.put("Phone"," is send");
        data.put("Tablet"," is send");
        data.put("Laptop"," is send");
        data.put("Smartwatch"," is send");
        data.put("Smartphone"," is send");
        data.put("Smart TV"," is send");
        data.put("Speaker"," is send");
        data.put("Headphones"," is send");
        data.put("Camera"," is send");
        data.put("Printer"," is send");
        TypeTrans.add("CONNECT");
        Collections.shuffle(Collections.singletonList(data));
        TypeTrans.add("LIB");



        data.forEach((k, v) ->
            TypeTrans.add(" "+"DATA"+" " + k + v));
        ///},



        
        Collections.shuffle(TypeTrans);


 for (int i =0;i<3;i++)
 {
     try {
         fw.write(NameAppSource.get(i) +"       "+NameAppDest.get(i)+"       "+TypeTrans.get(0)+"\n");
     } catch (IOException e) {
         e.printStackTrace();
     }

 }
  for (int i =0;i<6;i++)
  {
      try {
          fw.write(NameAppSource.get(i)+"       "+NameAppDest.get(i)+"       "+TypeTrans.get(1)+"\n");
      } catch (IOException e) {
          e.printStackTrace();
      }

  }
 for (int i =0;i<8;i++)
 {
     try {
         fw.write(NameAppSource.get(i)+"       "+NameAppDest.get(i)+"       "+TypeTrans.get(2)+"\n");
     } catch (IOException e) {
         e.printStackTrace();
     }

 }


            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




