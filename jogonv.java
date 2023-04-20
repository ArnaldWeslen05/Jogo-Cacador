    import java.util.Random;

    import javax.swing.JOptionPane;

    public class jogonv {
        public static void main(String[] args) throws InterruptedException {
            Random randon = new Random();//invocamos o construtor padrão -> zera os atributos
            personagem cacador = new personagem();//invocamos o construtor padrão -> zera os atributos,
            //porém temos valor inicias
            cacador.nome = "john";
            // personagem lenhador = new personagem("joao",8,5,2);
            // personagem pescador = new personagem("pedro",5,5,5);
            
           // cacador.energia = 1000;
           JOptionPane.showInputDialog("digite 'play' para começar  ");
            while (true) {
                switch (randon.nextInt(4)){
                    //vai gerar valores aleatórios
        case 0:
           
            cacador.cacar();
            
            break;
        case 1:

            cacador.dormir();
            break;

        case 2:

        cacador.comer();
            break;

        case 3:
          
        // cacador.experiencia();
           break;

          default:
      }
           

                System.out.println(cacador.informacoes());
                System.out.println("--------------------------\n");
                Thread.sleep(2000);
            }
        }
    }
 