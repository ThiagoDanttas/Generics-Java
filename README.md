# Generics, Set e Map - Java

---
Generics permitem que classes, interfaces e m�todos possam ser
parametrizados por tipo. Seus benef�cios s�o:

� Reuso

� Type safety

� Performance

� Uso comum: cole��es

~~~~java
public class Program {
    List<String> list = new ArrayList<>();
    list.add("Maria");
    String name = list.get(0);
}
~~~~

### Exerc�cios 

### Problema motivador 1 (reuso)
Deseja-se fazer um programa que leia uma quantidade N, e depois N n�meros
inteiros. Ao final, imprima esses n�meros de forma organizada conforme
exemplo. Em seguida, informar qual foi o primeiro valor informado.

### Problema motivador 2 (type safety & performance)
Deseja-se fazer um programa que leia uma quantidade N, e depois N nomes de
pessoas. Ao final, imprima esses n�meros de forma organizada conforme
exemplo. Em seguida, informar qual foi o primeiro valor informado.

### Solu��o com generics

Deseja-se fazer um programa que leia uma quantidade N, e depois N n�meros
inteiros. Ao final, imprima esses n�meros de forma organizada conforme
exemplo. Em seguida, informar qual foi o primeiro valor informado.

