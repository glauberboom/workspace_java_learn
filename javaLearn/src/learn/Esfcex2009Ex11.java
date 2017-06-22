package learn;
class Esfcex2009Ex11 {
public static void main(String[] args) {
int[] s= {2, 3, 5, 7};
int[] l= {101, 201, 301, 401, 501, 601};
System.arraycopy(s, 2, l, 4, 2);   //copia de uma array para outra (ponto inicial , ponto inicial , número de cópias)
for(int i= 0; i < l.length; i++)
System.out.print(l[i]+",");
System.out.println("Tamanho é:" + l.length);

}
}