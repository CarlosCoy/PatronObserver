// sujeto concreto
public class Servidor extends Central {

    private String emergencia;


    public void addPodcast(String emergencia){

        this.emergencia = emergencia;

        System.out.println("Nueva emergencia registrada");

        this.notifiy();
    }

    public String getPodcast() {
        return emergencia;
    }

    @Override
    public void notifiy() {
        observers.forEach(observer -> observer.update(this.emergencia));
    }

    public void removeByName(String name){
        this.removeObserver(observers.stream()
                .filter(observer -> observer instanceof Notificador && ((Notificador) observer).getName().equals(name))
                .findFirst()
                .get());
    }

}
