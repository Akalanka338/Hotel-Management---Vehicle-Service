package lk.ijse.vehicleservice.service;

import lk.ijse.vehicleservice.dto.VehicleDTO;
import lk.ijse.vehicleservice.entity.Vehicle;
import java.util.ArrayList;
import java.util.List;

public interface VehicleService {

    void  addVehicle(VehicleDTO vehicleDTO);

    void  deleteVehicele(long id);

    void updateVehicle(Vehicle vehicleDTO);

    ArrayList<VehicleDTO>getAllVehicles();

    List<VehicleDTO> searchVehicleByName(String vehicle_brand);

    Vehicle findById(long id);


}
