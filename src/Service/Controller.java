package Service;

public class Controller {
    public void StartTheDay(){
        DaySimulation daySimulation = new DaySimulation();
        daySimulation.MorningBreakfast();
        daySimulation.VetCheck();
        daySimulation.Cleaning();
        daySimulation.Training();
        daySimulation.Work();
        daySimulation.EveningMeal();
    }
}
