/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author campitos
 */
public interface RepoUsuario extends MongoRepository<Usuario, Integer>{
  List<Usuario>  findByNombre(String nombre);
}
