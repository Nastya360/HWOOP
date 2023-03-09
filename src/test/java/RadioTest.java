import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentRadioStation() {
        Radio rStation = new Radio();
        rStation.setCurrentRadioStation(2);
        int expected = 2;
        int actual = rStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationLessThatTheLimit() {
        Radio rStation = new Radio();
        rStation.setCurrentRadioStation(-5);
        int expected = 0;
        int actual = rStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentRadioStationOverLimit() {
        Radio rStation = new Radio();
        rStation.setCurrentRadioStation(15);
        int expected = 0;
        int actual = rStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastRadioStation() {
        Radio rStation = new Radio();
        rStation.setLastRadioStation();

        int expected = 9;
        int actual = rStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldGoToCycleStartRadioStation() {
        Radio rStation = new Radio();
        rStation.setNextRadioStation(12);

        int expected = 0;
        int actual = rStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldGoToNextRadioStation() {
        Radio rStation = new Radio();
        rStation.setNextRadioStation(2);

        int expected = 3;
        int actual = rStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldGoToPreviousRadioStation() {
        Radio rStation = new Radio();
        rStation.setPrevRadioStation(3);
        int expected = 2;
        int actual = rStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldGoToEndOfCycleRadioStation() {
        Radio rStation = new Radio();
        rStation.setPrevRadioStation(-3);
        int expected = 9;
        int actual = rStation.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 15;
        int expected = 15;
        int actual = volume.currentVolume;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 56;
        ;
        int expected = 57;
        int actual = volume.increaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 15;
        int expected = 14;
        int actual = volume.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 99;
        int expected = 100;
        int actual = volume.increaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxVolumeOutOfLimit() {
        Radio volume = new Radio();
        volume.currentVolume = 150;
        int expected = 100;
        int actual = volume.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolumeLimit() {
        Radio volume = new Radio();
        volume.currentVolume = 100;
        int expected = 100;
        int actual = volume.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolumeOutOfLimit() {
        Radio volume = new Radio();
        volume.currentVolume = -60;
        int expected = 0;
        int actual = volume.decreaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 1;
        int expected = 0;
        int actual = volume.decreaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinVolumeLimit() {
        Radio volume = new Radio();
        volume.currentVolume = 0;
        int expected = 0;
        int actual = volume.decreaseVolume();
        Assertions.assertEquals(expected, actual);

    }


}
