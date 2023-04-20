   public class jogoV2 {
      public static void main(String[] args) {
      personagem cacador = new personagem();
      cacador.nome = "jhon";
      for (int i=1; i<=12; i++){
         cacador.cacar(); 
      // for (; i<=12; i++){
      //    cacador.experiencia();
      }
         System.out.println("como" +  cacador.nome +" esta agora");
         System.out.println("energia =" + cacador.energia);
         System.out.println("fome =" + cacador.fome);
         System.out.println("sono =" + cacador.sono);
         System.out.println("experiencia =" + cacador.experiencia);
         }
      } 
      
   
