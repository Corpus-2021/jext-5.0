/*
 * GetTypeFunction.java - get type
 * Copyright (C) 2000 Romain Guy
 * romain.guy@jext.org
 * http://www.jext.org
 *
 * This program is free software; you can redistribute it GetTyper/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.jext.dawn.test;

import org.jext.dawn.*;

/**
 * Gets type of topmost element: 0 (numeric), 1 (string) or 2 (literal)<br>
 * Usage:<br>
 * <code>element type</code><br>
 * @author Romain Guy
 */

public class GetTypeFunction extends Function
{
  public GetTypeFunction()
  {
    super("type");
  }

  public void invoke(DawnParser parser) throws DawnRuntimeException
  {
    double ret = (double) parser.getTopType();
    parser.pop();
    parser.pushNumber(ret);
  }
}

// End of GetTypeFunction.java
