# 🔄 Conversão de Tipos (Casting) em Java

Este repositório demonstra como funciona o **casting em Java**, ou seja, a conversão entre diferentes tipos de dados.

---

## 🧠 O que é Casting?

Casting é o processo de **converter um tipo de dado em outro**. Pode ser:

### ✅ Implícita (Widening)
Conversão automática entre tipos compatíveis de menor para maior porte (ex: `int` → `double`).

```java
int a = 10;
double b = a; // Conversão implícita
System.out.println("Valor de b: " + b); // 10.0
````

### ⚠️ Explícita (Narrowing)

Conversão manual de tipos maiores para menores. Pode perder dados.

```java
double x = 9.8;
int y = (int) x; // Conversão explícita
System.out.println("Valor de y: " + y); // 9
```

---

## 📋 Exemplo Completo

```java
public class ConversaoTipos {
    public static void main(String[] args) {
        // Conversão implícita (sem perda)
        int idade = 30;
        double idadeDouble = idade;

        // Conversão explícita (com possível perda)
        double preco = 19.99;
        int precoInteiro = (int) preco;

        // Conversão entre tipos incompatíveis exige métodos específicos
        String numeroTexto = "123";
        int numero = Integer.parseInt(numeroTexto);

        System.out.println("Idade (double): " + idadeDouble);
        System.out.println("Preço (int): " + precoInteiro);
        System.out.println("Número convertido de String: " + numero);
    }
}
```