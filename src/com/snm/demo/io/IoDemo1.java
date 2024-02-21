package com.snm.demo.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IoDemo1 {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))){
            writer.write("Hello!");
            writer.newLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
