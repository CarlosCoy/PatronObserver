public class Notificador implements Bombero {
    private String name;


    public Notificador(String name) {
        this.name = name;
    }

    @Override
    public void update(String param) {
        System.out.println("Se ha registrado una nueva emergencia "+ name + " por favor dirigete al lugar del: " + param);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bombero voluntario: " + name;
    }
}
