public class Media{

    public static void main(String args[]){
        double mediaAluno;
        double nota1 = 7.2;
        double nota2 = 5.0;
        double nota3 = 8.1;
        double nota4 = 9.2;

        mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println(mediaAluno);

        if (mediaAluno <=10 && mediaAluno >=7) {
            System.out.println("Sua média é " + mediaAluno + " você está aprovado.");

        }   else if (mediaAluno >=5 && mediaAluno <7) {
             System.out.println("Sua média é " + mediaAluno + " você está de recuperação.");

           } else {
               System.out.println("Sua média é " + mediaAluno + " você está reprovado.");

           }
        }
    }


