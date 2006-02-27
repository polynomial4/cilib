/*
 * QueueTest.java
 * JUnit based test
 *
 * Created on January 04, 2005, 4:45 PM
 *
 * 
 * Copyright (C) 2003, 2004 - CIRG@UP 
 * Computational Intelligence Research Group (CIRG@UP)
 * Department of Computer Science 
 * University of Pretoria
 * South Africa
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA 
 *   
 */

package net.sourceforge.cilib.Container;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * This Unit test tests all the needed operations of the Queue container class.
 *
 * @author gpampara
 */
public class QueueTest extends TestCase {

	public QueueTest(java.lang.String testName) {
		super(testName);
	}

	public static void main(java.lang.String[] args) {
		junit.textui.TestRunner.run(suite());
	}

	public static Test suite() {
		TestSuite suite = new TestSuite(MatrixTest.class);

		return suite;
	}

	public void setUp() {
	}

	public void testQueueCreation() {
		Queue<Double> q = new Queue<Double>();
		assertNotNull(q);
	}

	public void testRemoveEmptyQueue() {
		Queue<Double> q = new Queue<Double>();
		Double result1 = q.remove();
		Double result2 = q.dequeue();

		assertNull(result1);
		assertNull(result2);
	}

	public void testAddingElement() {
		Queue<Double> q = new Queue<Double>();

		Double tmp = new Double(5.0);
		q.enqueue(tmp);
		q.add(tmp);

		assertEquals(2, q.size());
	}

	public void testClearQueue() {
		Queue<Double> q = new Queue<Double>();

		q.add(new Double(4.0));
		q.clear();

		assertEquals(true, q.isEmpty());
	}
}