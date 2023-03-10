public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public Radio() {
        maxRadioStation = getMaxRadioStation();
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        return currentVolume;
    }


    public void setLastRadioStation() {
        currentRadioStation = maxRadioStation;
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



