#region Copyright (c) 2001-2011 Mathew A. Nelson and Robocode contributors

// Copyright (c) 2001-2011 Mathew A. Nelson and Robocode contributors
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://robocode.sourceforge.net/license/epl-v10.html

#endregion

using Robocode;

public class NoPackageShortNameCs : Robot
{
    public override void Run()
    {
        while (true)
        {
            Ahead(1); // Move ahead 100
            TurnGunRight(360); // Spin gun around
            Back(1); // Move back 100
            TurnGunRight(360); // Spin gun around
        }
    }
}
