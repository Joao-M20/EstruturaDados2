import javax.swing.*;

public class Opa {
    public static void main(String[] args) {
        //chamando o método que contém o programa
        tempFinal();

    }
    //Método que estatodo meu programa
    public static void tempFinal(){
        //vetor com 7 posições
        double [] temperatura = new double[7];
        double soma, media;
        int contador, dias_acima, dias_abaixo;
        soma = 0;


		/*O usuário irá digitar 7 temperaturas e todas as temperaturas serão somadas e guardadas na variável soma*/
        for (contador = 0; contador <7; contador++){
            temperatura [contador] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (contador + 1) +"° temperatura"));
            soma = soma + temperatura[contador];
        }
        media = soma / 7;
        dias_acima = 0;
        dias_abaixo =0;
		/*se a temperatura na posição do contador for maior que a media
		é incrementado 1 na variável dias_acima*/
        for (contador = 0; contador <7; contador++){
            if (temperatura[contador] > media){
                dias_acima = dias_acima +1;
            }
			/*se a temperatura na posição do contador for menor que a media
			é incrementado 1 na variável dias_abaixo*/
            if (temperatura[contador]<media){
                dias_abaixo = dias_abaixo + 1;
            }
        }
        //exibindo a media das temperaturas, quantidade de dias acima da média e quantidade de dias abaixo da média
        JOptionPane.showMessageDialog(null, "A média " +
                "das temperaturas é " + media);
        JOptionPane.showMessageDialog(null, "A quantidade " +
                "de dias acima da média é " + dias_acima);
        JOptionPane.showMessageDialog(null, "A quantidade " +
                "de dias abaixo da mé dia é " + dias_abaixo);

    }
}
