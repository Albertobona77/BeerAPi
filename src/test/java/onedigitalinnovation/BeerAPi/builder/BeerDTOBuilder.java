package onedigitalinnovation.BeerAPi.builder;

import lombok.Builder;
import onedigitalinnovation.BeerAPi.dto.BeerDTO;
import onedigitalinnovation.BeerAPi.enums.BeerType;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Bhoemia";

    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private int max = 50;

    @Builder.Default
    private int quantity = 25;

    @Builder.Default
    private BeerType type = BeerType.LAGER;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
    }
}
