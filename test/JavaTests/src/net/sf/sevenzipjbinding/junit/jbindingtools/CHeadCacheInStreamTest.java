package net.sf.sevenzipjbinding.junit.jbindingtools;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import net.sf.sevenzipjbinding.junit.JUnitNativeTestBase2;
import net.sf.sevenzipjbinding.junit.junittools.annotations.DebugModeOnly;
import net.sf.sevenzipjbinding.junit.junittools.annotations.Repeat;

public class CHeadCacheInStreamTest extends JUnitNativeTestBase2 {
    private native String nativeSimpleTests();

    @Test
    @Repeat
    @DebugModeOnly
    public void simpleTests() {
        String errors = nativeSimpleTests();
        assertNull(errors, errors);
    }
}


