package pt.up.fe.ldts.example6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class TreeTest {
    public Tree tree;
    public Date date;

    @BeforeEach
    public void setUp() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        date = sdf.parse("31-08-2002 10:20:56");
        tree = new Tree(date, "41.177772696363114", "-8.59843522310257", "FEUP");
    }

    @Test
    public void testTreeCreation() {
        assertEquals(tree.plantedAt, date);
        assertEquals(tree.location.getLocationLatitude(), "41.177772696363114");
        assertEquals(tree.location.getLocationLongitude(), "-8.59843522310257");
        assertEquals(tree.location.getLocationName(), "FEUP");
    }

    @Test
    public void testTreeSetLocation() {
        tree.location.setLocation("loclat", "loclon", "locname");
        assertEquals(tree.plantedAt, date);
        assertEquals(tree.location.getLocationLatitude(), "loclat");
        assertEquals(tree.location.getLocationLongitude(), "loclon");
        assertEquals(tree.location.getLocationName(), "locname");
    }

    @Test
    public void testToString() {
        String result = tree.toString();
        assertEquals("Tree planted at Sat Aug 31 10:20:56 WEST 2002 in location 41.177772696363114,-8.59843522310257 (FEUP)", result);
    }

    @Test
    public void testAddAppraisal() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        Date appraisalDate = sdf.parse("31-08-2002 10:20:56");

        assertEquals(tree.getAppraisals().size(), 0);
        tree.addAppraisal(appraisalDate);
        assertEquals(tree.getAppraisals().size(), 1);
    }

    @Test
    public void testNextAppraisalOverdue() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, -6);
        Date appraisalDate = calendar.getTime();

        assertFalse(tree.isNextAppraisalOverdue());
        tree.addAppraisal(appraisalDate);
        assertTrue(tree.isNextAppraisalOverdue());
    }

    @Test
    public void testNextAppraisalNotOverdue() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, -1);
        Date appraisalDate = calendar.getTime();

        assertFalse(tree.isNextAppraisalOverdue());
        tree.addAppraisal(appraisalDate);
        assertFalse(tree.isNextAppraisalOverdue());
    }

}
