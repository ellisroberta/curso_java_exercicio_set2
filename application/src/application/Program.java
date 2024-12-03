package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> students = new HashSet<>(); // Conjunto para armazenar os códigos dos alunos

        // Lê os alunos do curso A
        System.out.print("How many students for course A? ");
        int nA = sc.nextInt();
        for (int i = 0; i < nA; i++) {
            int studentCode = sc.nextInt();
            students.add(studentCode); // Adiciona o código do aluno ao conjunto
        }

        // Lê os alunos do curso B
        System.out.print("How many students for course B? ");
        int nB = sc.nextInt();
        for (int i = 0; i < nB; i++) {
            int studentCode = sc.nextInt();
            students.add(studentCode); // Adiciona o código do aluno ao conjunto
        }

        // Lê os alunos do curso C
        System.out.print("How many students for course C? ");
        int nC = sc.nextInt();
        for (int i = 0; i < nC; i++) {
            int studentCode = sc.nextInt();
            students.add(studentCode); // Adiciona o código do aluno ao conjunto
        }

        // Exibe o total de alunos distintos
        System.out.println("Total students: " + students.size());

        sc.close(); // Fecha o scanner
    }
}