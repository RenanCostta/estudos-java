package ExSet;

import ExDomain.Aluno;

import java.util.HashSet;
import java.util.Set;

public class ExamploHashSetAluno {
    public static void main(String[] args) {

        exemploListaSimplesHashSet();
        exemploConsultando();
        exemploRemover();

    }


    private static void exemploListaSimplesHashSet() {

        System.out.println("******* exemplo lista simples hash set *******");

        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcio ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio sousa", "OpenOffice", 0);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto);
        System.out.println();
    }

    private static void exemploConsultando() {

        System.out.println("******* exemplo consultando ********");

        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcio ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio sousa", "OpenOffice", 0);
        Aluno e = new Aluno("Teste contains", "OpenOffice", 0);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto.contains(a));
        System.out.println(conjunto.contains(e));

        System.out.println();
    }

    private static void exemploRemover() {

        System.out.println("******* exemplo remover ********");

        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcio ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio sousa", "OpenOffice", 0);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto);

        conjunto.remove(a);

        System.out.println(conjunto);

        for (Aluno aluno : conjunto) {
            System.out.println(aluno);
        }

    }
}