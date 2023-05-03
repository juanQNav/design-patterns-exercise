package oop.inheritance;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

public class MainTest {
    //Mocks
    @Test
    public void when1IsTyped_thenShowConfigurationIsCalled(){
        //Given
        Application application = mock(Application.class);
        //When
        when(application.readKey()).thenReturn("1");
        Main.run(application);
        //Then

        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).doSale();

        verifyNoMoreInteractions(application);
    }
    @Test
    public void when2IsTyped_thenShowConfigurationIsCalled(){
        //Given
        Application application = mock(Application.class);
        //When
        when(application.readKey()).thenReturn("2");
        Main.run(application);
        //Then

        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).doRefund();

        verifyNoMoreInteractions(application);
    }
    @Test
    public void when3IsTyped_thenShowConfigurationIsCalled(){
        //Given
        Application application = mock(Application.class);
        //When
        when(application.readKey()).thenReturn("3");
        Main.run(application);
        //Then

        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).printReport();

        verifyNoMoreInteractions(application);
    }
    @Test
    public void when4IsTyped_thenShowConfigurationIsCalled(){
        //Given
        Application application = mock(Application.class);
        //When
        when(application.readKey()).thenReturn("4");
        Main.run(application);
        //Then

        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).showConfiguration();

        verifyNoMoreInteractions(application);
    }
}
