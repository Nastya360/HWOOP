public class Radio {

    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
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


    public void setLastRadioStation() {
        currentRadioStation = 9;
    }


    public int currentVolume;

    public void setIncreaseVolume(int newIncreaseVolume) {
        if (newIncreaseVolume < 100) {
            currentVolume = newIncreaseVolume + 1;
        } else {
            currentVolume = 100;
        }
    }


    public void setDecreaseVolume(int newDecreaseVolume) {
        if (newDecreaseVolume > 0) {
            currentVolume = newDecreaseVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


}



