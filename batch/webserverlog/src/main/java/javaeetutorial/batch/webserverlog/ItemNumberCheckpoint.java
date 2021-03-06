/**
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.batch.webserverlog;

import java.io.Serializable;

/* Class for checkpoint objects.
 */
public class ItemNumberCheckpoint implements Serializable {

    private long lineNum;

    public ItemNumberCheckpoint() {
        lineNum = 0;
    }

    public long getLineNum() {
        return lineNum;
    }

    public void nextLine() {
        lineNum++;
    }
}
