package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @QuestType(type = QuestType.Type.DRAGON)
public class KillDragonQuest implements Quest {

    public  String goQuest(){
        return "Knight Killed the dragon";
    }

}
