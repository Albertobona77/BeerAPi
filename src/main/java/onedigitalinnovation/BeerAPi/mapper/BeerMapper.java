package onedigitalinnovation.BeerAPi.mapper;


import onedigitalinnovation.BeerAPi.entity.Beer;
import onedigitalinnovation.BeerAPi.dto.BeerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}