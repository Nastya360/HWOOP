public class Radio {

    private int currentRadioStation;
    private int currentVolume;

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
        currentRadioStation = 9;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setNextRadioStation(int newNextRadioStation) {
        if (newNextRadioStation > 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = newNextRadioStation + 1;
        }


    }

    public void setPrevRadioStation(int newPrevRadioStation) {
        if (newPrevRadioStation < 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = newPrevRadioStation - 1;
        }
    }


    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
        return currentVolume;
    }


}




