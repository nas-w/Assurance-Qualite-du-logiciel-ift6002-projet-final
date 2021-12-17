package ca.ulaval.glo4002.game.domain.action;

import ca.ulaval.glo4002.game.domain.dinosaur.Dinosaur;
import ca.ulaval.glo4002.game.domain.dinosaur.herd.Herd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AddBabyDinosaurActionTest {

    private Dinosaur babyDinosaur;
    private Herd herd;
    private AddBabyDinosaurAction addBabyDinosaurAction;

    @BeforeEach
    public void setUp() {
        babyDinosaur = mock(Dinosaur.class);
        herd = mock(Herd.class);
        addBabyDinosaurAction = new AddBabyDinosaurAction(herd, babyDinosaur);
    }

    @Test
    public void givenADinosaur_WhenExecute_thenDinosaurIsAddedToHerd() {
        addBabyDinosaurAction.execute();

        verify(herd).addDinosaur(babyDinosaur);
    }
}
