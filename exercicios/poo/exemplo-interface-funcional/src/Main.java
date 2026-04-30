import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = List.of(new Usuario("Maria", 21), new Usuario("Joao", 23));
        usuarios.forEach(usuario -> System.out.println(usuario));
    }
}
