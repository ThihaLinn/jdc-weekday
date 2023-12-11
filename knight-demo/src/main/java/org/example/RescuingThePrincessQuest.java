package org.example;

import org.springframework.stereotype.Component;

@Component @QuestType(type = QuestType.Type.PRINCESS)
public class RescuingThePrincessQuest implements Quest{

    public  String goQuest(){
        return "Knight is going to rescue the quest";
    }
}
