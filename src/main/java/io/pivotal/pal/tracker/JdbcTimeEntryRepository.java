package io.pivotal.pal.tracker;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import javax.sql.DataSource;
import java.util.List;

public class JdbcTimeEntryRepository implements TimeEntryRepository{
   private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    TimeEntryRepository timeEntryRepository = null;

    public JdbcTimeEntryRepository(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Override
    public TimeEntry create(TimeEntry timeEntry) {
jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update((PreparedStatementCreator) dataSource);

        timeEntryRepository.create(timeEntry);
        return null;
    }

    @Override
    public TimeEntry find(long id) {
        return null;
    }

    @Override
    public List<TimeEntry> list() {
        return null;
    }

    @Override
    public TimeEntry update(long id, TimeEntry timeEntry) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
