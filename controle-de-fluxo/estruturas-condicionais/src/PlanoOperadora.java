public class PlanoOperadora {

    public static void main(String[] args) {

        String plano = "M"; // P, M OU G

        switch(plano) {

            case "B": {
                System.out.println("100 minutos de ligação");
            }
            case "M": {
                System.out.println("100 minutos de ligação e WhatsApp Ilimitado");
            }
        }


    }
    
}