package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public interface Rhymersfactory {
    
        public DefaultCountingOutRhymer getStandardRhymer();
        
        public DefaultCountingOutRhymer getFalseRhymer();
        
        public DefaultCountingOutRhymer getFIFORhymer();
        
        public HanoiRhymer getHanoiRhymer();
        
    }
