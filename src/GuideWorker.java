import java.util.ArrayList;
import java.util.List;

public class GuideWorker {
    private List<Worker> workerList;

    public GuideWorker(List<Worker> workerList) {
        this.workerList = workerList;
    }

    public GuideWorker() {
        this.workerList = new ArrayList<>();
    }

    public boolean add(Worker worker) {
        if (!checkAlreadyContains(worker)) {
            workerList.add(worker);
            return true;
        }
        System.err.println("Сотрудник уже существует в справочнике!");
        return false;
    }

    public boolean add(int idNumber, String phoneNumber, String name, int experienc) {

        if (!checkUniquenessIDNumber(idNumber)) {
            workerList.add(new Worker(idNumber, phoneNumber, name, experienc));
            return true;
        }
        System.err.println("Сотрудник c таким idNumber уже существует в справочнике!");
        return false;
    }

    public List<Worker> findWorkerByExperience (int experienc) {
        List<Worker> result = new ArrayList<>();
        for (Worker worker : workerList) {
            if (worker.getExperience() == experienc) {
                result.add(worker);
            }
        }
        return result;
    }

    public List<String> findPhoneNumberByname(String name) {
        List<String> result = new ArrayList<>();
        for (Worker worker : workerList) {
            if (worker.getName().contains(name)) {
                result.add(worker.getName() + ": " + worker.getPhoneNumber());
            }
        }
        return result;
    }

    public Worker findWorkerByIdNumber(int idNumber) {
        for (Worker worker : workerList) {
            if (worker.getIdNumber() == idNumber) {
                return worker;
            }
        }
        return null;
    }



    private boolean checkAlreadyContains (Worker worker) {
        return workerList.contains(worker);
    }

    private boolean checkUniquenessIDNumber (int idNumber) {
        for (Worker worker : workerList) {
            if (worker.getIdNumber() == idNumber) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Worker worker : workerList) {
            stringBuilder.append(worker.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
