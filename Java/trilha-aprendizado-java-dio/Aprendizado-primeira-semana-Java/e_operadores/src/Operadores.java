
public class Operadores {
    public static void main(String[] args) {
String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?"; 

concatenacao = 1+1+1+"1";
System.out.println(concatenacao);

concatenacao = 1+"1"+1+1;
System.out.println(concatenacao);

concatenacao = 1+"1"+1+"1";
System.out.println(concatenacao);

concatenacao = "1"+1+1+1;
System.out.println(concatenacao);

concatenacao = "1"+(1+1+1);
System.out.println(concatenacao);


int numero = 5;
//x repeticao
//numero = numero +1;

System.out.println(++ numero);
System.out.println(numero);

boolean variavel = true;
                               variavel = !variavel;
                               System.out.println(!variavel);

int a;
int b;

a = 5;
b = 7;

                    String resultado = a == b ? "verdadeiro" : "falso";
                    System.out.println(resultado);
                  
                    int numero1 = 1;
                    int numero2 = 2;
                    boolean simNao = numero1 == numero2;
                    if(numero1 < numero2){ System.out.println("a nossa condição é verdadeira");
                }
                    System.out.println("numeroUm é igual a numeroDois?" + simNao );
                    simNao = numero1 > numero2;
                    System.out.println("numeroUm é maior que numeroDois?" + simNao);
String nomeUm = "Rafaela";
String nomeDois = new String("Rafaela");


System.out.println(nomeDois.equals("Rafaela"));


boolean condicao1 = true;
boolean condicao2 = false;
if(condicao1 && condicao2){
    System.out.println("as duas condições são verdadeiras");
}
if (condicao2 || condicao1 ){ System.out.println("Uma das condições é verdadeira");
    
}
if(condicao1 && ( 7 >4 )){ System.out.println("as duas condições são verdadeiras");}
                }}



    

