package sv.com.inventario.servicios;

import sv.com.inventario.controladores.dto.request.InventarioRequestDTO;
import sv.com.inventario.modelo.entity.Inventario;

import java.util.List;

public interface InventarioService {

    List<Inventario> consTodoExistencias(Integer cantidad);

    Inventario consInventario(Long id);

    Inventario actuInventario(Inventario inventario);

    Boolean guarInventario(InventarioRequestDTO request);

    Boolean elimInventario(Long id);


}
