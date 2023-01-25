# Generics, Set e Map - Java

---
Generics permitem que classes, interfaces e métodos possam ser
parametrizados por tipo. Seus benefícios são:

• Reuso

• Type safety

• Performance

• Uso comum: coleções

~~~~java
public class Program {
    List<String> list = new ArrayList<>();
    list.add("Maria");
    String name = list.get(0);
}
~~~~

### Exercícios 

### Problema motivador 1 (reuso)
Deseja-se fazer um programa que leia uma quantidade N, e depois N números
inteiros. Ao final, imprima esses números de forma organizada conforme
exemplo. Em seguida, informar qual foi o primeiro valor informado.

### Problema motivador 2 (type safety & performance)
Deseja-se fazer um programa que leia uma quantidade N, e depois N nomes de
pessoas. Ao final, imprima esses números de forma organizada conforme
exemplo. Em seguida, informar qual foi o primeiro valor informado.

### Solução com generics

Deseja-se fazer um programa que leia uma quantidade N, e depois N números
inteiros. Ao final, imprima esses números de forma organizada conforme
exemplo. Em seguida, informar qual foi o primeiro valor informado.

