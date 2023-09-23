/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.hire.Service.Custom;

import java.util.ArrayList;
import pos.hire.Dto.CustomerDto;
import pos.hire.Dto.RentalDetailDto;
import pos.hire.Service.SuperService;

/**
 *
 * @author BIMSARA
 */
public interface RentalDetailService extends SuperService{
    String addHire(RentalDetailDto hireDto) throws Exception;

    String updateHire(RentalDetailDto hireDto) throws Exception;

    String deleteHire(String id) throws Exception;

    RentalDetailDto getHire(String id) throws Exception;

    ArrayList<RentalDetailDto> getAllHire() throws Exception;
}
