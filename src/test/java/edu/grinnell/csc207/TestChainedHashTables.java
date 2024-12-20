package edu.grinnell.csc207;

import org.junit.jupiter.api.BeforeEach;

import edu.grinnell.csc207.util.ChainedHashTable;

/**
 * Tests of chained hash tables.
 *
 * @author Your Name Here
 * @author Your Name Here
 * @author Samuel A. Rebelsky
 */
public class TestChainedHashTables extends TestSimpleMaps {
  /**
   * Set up the string map.
   */
  @BeforeEach
  public void setupChainedHashTableTests() {
    stringMap = new ChainedHashTable<String,String>();
    runIteratorTests = false;
  } // setupChainedHashTableTests()
} // class TestChainedHashTables
