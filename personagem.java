public class personagem {
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    int experiencia = 0;

    public personagem (int energia, int fome, int sono, int experiencia){
        //construtor
            if (energia >= 0 && energia <= 10) {
                 this.energia = energia;
        }
            if(fome >=0 && fome <= 10){
            this.fome = fome;
        }
           if (sono >=0 && sono <=10){
            this.sono = sono;
        }
           if (experiencia >=0 && experiencia <=10){
             this.experiencia = experiencia;
           }
    }
    //sobrecarga de construtor 
  public personagem(String nome, int energia,int fome, int sono, int experiencia){
                  this(energia, fome, sono, experiencia);
                  this.nome = nome;
  }
  //redefindo o contrutor padrão
  public personagem(){
    nome = "arnald";
    energia = 10;
    fome = 0;
    sono = 0;
  }
    void cacar() {
        if (energia >= 2) {
        System.out.println( nome + " cacando");
        energia = energia -2;
        // experiencia +=1;
        
    }
    else {
        System.out.println(nome + " esta sem energia para cacar");
        
    }

    fome = Math.min(10, fome + 1);
    sono = Math.min(10, sono + 1);
    experiencia = Math.min(10, experiencia + 1);
    
    }
   
    
        void comer () {
            if(fome >= 1) {
            System.out.println( nome + " comendo");
            
            fome -= 1; 
        

            energia = Math.min(10, energia+1);
            }else{
                System.out.println(nome + " sem fome");
            }
        }
         void experiencia() {
          
           }
           
          
         
        void dormir () {
            if(sono >= 1 ){
            System.out.println( nome + " dormindo... zzz");
            sono = sono - 1;
            energia = energia+1>10 ? 10 : energia + 1;
        }
        else{
                System.out.println(nome + "esta sem sono");
            }
        }
        String informacoes () {
            return "como " +  nome + " esta agora :" + "\nenergia =" + energia + "\nfome " + fome +"\nsono =" + sono + "\nexperiencia = "+ experiencia;
            
        }
        
    }
        

