package com.company;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author George Sapozhkov
 */
public class Main {
    public static void main(String[] args) throws Exception {
        List<Human> all=new ArrayList<>();
        File file =new File("foreign_names.csv");
        FileReader reader = new FileReader(file);
        CSVReader csvReader = new CSVReader(reader,';','"',1);
        String[] line;
        while ((line= csvReader.readNext())!=null){
            Human tmp= new Human(Integer.parseInt(line[0]),line[1],line[2],line[3],line[4],Integer.parseInt(line[5]));
            System.out.println(tmp.toString());
            all.add(tmp);
            ;
        }
    }
}

