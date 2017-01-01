package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    /**
    * Add method
    */
    
    public final void add(TimeEntry entry) {
        entries.add(entry);
    }

    /**
    * Remove method
    */
    
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    /**
    * Get Size method
    */
    public int size() {
        return entries.size();
    }

    /**
    * Get index method
    */    
    
    public TimeEntry get(int index) {
        return entries.get(index);
    }
}

