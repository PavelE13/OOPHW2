package Interfaces;

import Classes.Actor;

public interface iQueuBehaviour {
    void takeInQueue(iActorBehaviour actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
    void returnOrder();
}
