package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobAscenByPriority().thenComparing(new JobAscenByName());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByName() {
        Comparator<Job> cmpName = new JobAscenByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, lessThan(4));
    }

    @Test
    public void whenComparatorByNameDesc() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 3)
        );
        assertThat(rsl, lessThan(4));
    }

    @Test
    public void whenComparatorByPriority() {
        Comparator<Job> cmpName = new JobAscenByPriority();
        int rsl = cmpName.compare(
                new Job("Impl task", 2),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(3));
    }

    @Test
    public void whenComparatorByPriorityDesc() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 2),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(3));
    }
}