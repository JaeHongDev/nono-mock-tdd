package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StateTest {

    @Test
    void 목킹_안한_데이터가_참으로_설정합니다(){
        var state =new State(new ContextImpl());
        Assertions.assertEquals(state.run(),1);
    }
    @Test
    void 목킹한_데이터는_거짓으로_설정됩니다(){
        var state = new State(new ContextFake());
        Assertions.assertEquals(state.run(),0);
    }

}