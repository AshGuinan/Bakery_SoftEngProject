/*
 * Copyright (c) 2010, Oracle. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provcakeNameed that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provcakeNameed with the distribution.
 *
 * * Neither the name of Oracle nor the names of its contributors
 *   may be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */


package enterprise.web_jpa_war.entity;

import javax.persistence.*;

/**
 *
 * @author mitesh
 */
@Entity
@Table(name = "Cake")
public class Cake {

    @Id
    @Column (name="ID")
    private String ID;
    
    @Column(name = "CakeName")
    private String CakeName;

    @Column(name = "Ingredients")
    private String Ingredients;

    @Column(name = "Stock")
    private int Stock;

    /**
     * Creates a new instance of Cake
     */
    public Cake() {
    }

    public Cake(String ID, String cakeName, String Ingredients, int Stock) {
        this.ID = ID;
        this.CakeName = cakeName;
        this.Ingredients = Ingredients;
        this.Stock  = Stock;
    }

    public String getID(){
        return this.ID;
    }
    public String getCakeName() {
        return this.CakeName;
    }

    public int getStock() {
        return this.Stock;
    }

    public String getIngredients() {
        return this.Ingredients;
    }
    
}
