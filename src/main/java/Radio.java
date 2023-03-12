public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int quantityRadioStation = 10;

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public Radio() {
        quantityRadioStation = getQuantityRadioStation();
    }


    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }


    public int setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        return currentVolume;
    }


    public void setLastRadioStation() {
        currentRadioStation = quantityRadioStation - 1;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setNextRadioStation(int newNextRadioStation) {
        if (newNextRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation = newNextRadioStation + 1;
        }


    }

    public void setPrevRadioStation(int newPrevRadioStation) {
        if (newPrevRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation = newPrevRadioStation - 1;
        }
    }


    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }


}



