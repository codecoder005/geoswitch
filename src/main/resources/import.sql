INSERT INTO continent(continent_id, name) VALUES('c1a9e7a2-f8e7-4b8f-b5d7-e1b9c34c1f94', 'Africa');
INSERT INTO continent(continent_id, name) VALUES('e94a717f-4e1b-4892-8c9c-61b9cf0cb2b4', 'Antarctica');
INSERT INTO continent(continent_id, name) VALUES('f91b2371-4ae8-4e2d-9a5f-08f0b83b8a85', 'Asia');
INSERT INTO continent(continent_id, name) VALUES('c3f29f5c-d44d-4f8c-b0a6-1a2b3b7c5e75', 'Europe');
INSERT INTO continent(continent_id, name) VALUES('b2c7e6d7-2fa8-4f9b-9a2e-16d9e9a7b6c4', 'North America');
INSERT INTO continent(continent_id, name) VALUES('a4d8f8a7-6a7d-4291-9a9f-3f2c9a8b7d5e', 'Oceania');
INSERT INTO continent(continent_id, name) VALUES('d6a7f3e8-4e8a-4c8a-9a5d-0f9b4c7a6b85', 'South America');

-- Africa
INSERT INTO country(country_id, continent_id, name) VALUES('8d0a8d3b-b04b-4a3b-aeae-5052c1a9a2ef', 'c1a9e7a2-f8e7-4b8f-b5d7-e1b9c34c1f94', 'Nigeria');
INSERT INTO country(country_id, continent_id, name) VALUES('b0a5a2b8-d2e0-4a63-bd6e-497b810b4b2f', 'c1a9e7a2-f8e7-4b8f-b5d7-e1b9c34c1f94', 'South Africa');
INSERT INTO country(country_id, continent_id, name) VALUES('d89b9e91-78c2-4b15-87f5-e2a9f0c5c42e', 'c1a9e7a2-f8e7-4b8f-b5d7-e1b9c34c1f94', 'Egypt');

-- Antarctica
-- (No countries, as Antarctica does not have countries, but is divided into territorial claims by various nations)

-- Asia
INSERT INTO country(country_id, continent_id, name) VALUES('c57e8b32-99e1-4a5a-8e3b-7d3d272ef5a4', 'f91b2371-4ae8-4e2d-9a5f-08f0b83b8a85', 'China');
INSERT INTO country(country_id, continent_id, name) VALUES('a60d1a27-0a2b-4b0d-97b1-2e6b33c53d36', 'f91b2371-4ae8-4e2d-9a5f-08f0b83b8a85', 'India');
INSERT INTO country(country_id, continent_id, name) VALUES('b17f8d57-9c0d-4bfb-80e5-87b239e4a4dc', 'f91b2371-4ae8-4e2d-9a5f-08f0b83b8a85', 'Japan');

-- Europe
INSERT INTO country(country_id, continent_id, name) VALUES('e31b4b47-c3e6-46e1-94ec-3f5a1b042f4b', 'c3f29f5c-d44d-4f8c-b0a6-1a2b3b7c5e75', 'Germany');
INSERT INTO country(country_id, continent_id, name) VALUES('d70f6c8a-0b87-4b64-9d36-cb39c732f7c5', 'c3f29f5c-d44d-4f8c-b0a6-1a2b3b7c5e75', 'France');
INSERT INTO country(country_id, continent_id, name) VALUES('f6db7b60-c7f0-44de-b62e-d0a2d179dbf8', 'c3f29f5c-d44d-4f8c-b0a6-1a2b3b7c5e75', 'Italy');

-- North America
INSERT INTO country(country_id, continent_id, name) VALUES('72a0a546-6d85-4b84-9e41-f8d8b97a63e0', 'b2c7e6d7-2fa8-4f9b-9a2e-16d9e9a7b6c4', 'United States');
INSERT INTO country(country_id, continent_id, name) VALUES('9176f0b6-6f23-4690-ae12-2b67d3c27f26', 'b2c7e6d7-2fa8-4f9b-9a2e-16d9e9a7b6c4', 'Canada');
INSERT INTO country(country_id, continent_id, name) VALUES('f6232f4c-2ea0-4c2b-bd5c-b1b9b35d65c7', 'b2c7e6d7-2fa8-4f9b-9a2e-16d9e9a7b6c4', 'Mexico');

-- Oceania
INSERT INTO country(country_id, continent_id, name) VALUES('bc85b7b7-4c58-42b2-9f3d-60b2186b1d7d', 'a4d8f8a7-6a7d-4291-9a9f-3f2c9a8b7d5e', 'Australia');
INSERT INTO country(country_id, continent_id, name) VALUES('8c9d5f95-0a84-41d5-87e8-d7f978f062f7', 'a4d8f8a7-6a7d-4291-9a9f-3f2c9a8b7d5e', 'New Zealand');
INSERT INTO country(country_id, continent_id, name) VALUES('d485d327-57d0-4c4a-bb6b-5920e7604d1b', 'a4d8f8a7-6a7d-4291-9a9f-3f2c9a8b7d5e', 'Fiji');

-- South America
INSERT INTO country(country_id, continent_id, name) VALUES('3c4e749f-6d2e-48b8-bd36-1b9d96e7a8d6', 'd6a7f3e8-4e8a-4c8a-9a5d-0f9b4c7a6b85', 'Brazil');
INSERT INTO country(country_id, continent_id, name) VALUES('64d1f23c-6a9c-4d8f-b26d-4e09892e7b8b', 'd6a7f3e8-4e8a-4c8a-9a5d-0f9b4c7a6b85', 'Argentina');
INSERT INTO country(country_id, continent_id, name) VALUES('c9788e56-46c2-4f88-9a88-d7b5a6e6e8d0', 'd6a7f3e8-4e8a-4c8a-9a5d-0f9b4c7a6b85', 'Chile');


-- Africa
-- Nigeria
INSERT INTO state(state_id, country_id, name) VALUES('e01b6c9e-7b8f-4b74-bd6b-2a5e8e5d1234', '8d0a8d3b-b04b-4a3b-aeae-5052c1a9a2ef', 'Lagos');
INSERT INTO state(state_id, country_id, name) VALUES('b76d1a91-3b59-4d72-9d75-4b8e7e6c1234', '8d0a8d3b-b04b-4a3b-aeae-5052c1a9a2ef', 'Abuja');

-- South Africa
INSERT INTO state(state_id, country_id, name) VALUES('d7e5f0a2-4f4c-4b8a-9d26-b0d8f5b1d234', 'b0a5a2b8-d2e0-4a63-bd6e-497b810b4b2f', 'Gauteng');
INSERT INTO state(state_id, country_id, name) VALUES('a9c9f1b3-7b8e-4d6f-9c34-b5a9f4e6d234', 'b0a5a2b8-d2e0-4a63-bd6e-497b810b4b2f', 'Western Cape');

-- Egypt
INSERT INTO state(state_id, country_id, name) VALUES('b3d7a8e2-9e8f-4d7a-a2d1-6b8c9e3f1234', 'd89b9e91-78c2-4b15-87f5-e2a9f0c5c42e', 'Cairo');
INSERT INTO state(state_id, country_id, name) VALUES('c7d6f0b3-2e9d-4f8a-9b5f-a8e7d9b2c234', 'd89b9e91-78c2-4b15-87f5-e2a9f0c5c42e', 'Alexandria');

-- Asia
-- China
INSERT INTO state(state_id, country_id, name) VALUES('f0e8c9d2-4d6a-4e7c-9b8e-2b6f5d9e1234', 'c57e8b32-99e1-4a5a-8e3b-7d3d272ef5a4', 'Beijing');
INSERT INTO state(state_id, country_id, name) VALUES('d3e9b5c8-7d8a-4e8b-9c0e-5a8b6f3d1234', 'c57e8b32-99e1-4a5a-8e3b-7d3d272ef5a4', 'Shanghai');

-- India
INSERT INTO state(state_id, country_id, name) VALUES('a1e5b9c3-4d8f-4c7e-8e1f-9c0e8b2d1234', 'a60d1a27-0a2b-4b0d-97b1-2e6b33c53d36', 'Maharashtra');
INSERT INTO state(state_id, country_id, name) VALUES('b7d8c0e1-4d9e-4b7f-8e2d-3a4f5c6d1234', 'a60d1a27-0a2b-4b0d-97b1-2e6b33c53d36', 'Delhi');

-- Japan
INSERT INTO state(state_id, country_id, name) VALUES('c3b7f1e2-4a8d-4f8b-9d3e-b5c6d7e8f234', 'b17f8d57-9c0d-4bfb-80e5-87b239e4a4dc', 'Tokyo');
INSERT INTO state(state_id, country_id, name) VALUES('d8e6f2c1-4f9a-4c8b-8e2d-7b5c8d9e1234', 'b17f8d57-9c0d-4bfb-80e5-87b239e4a4dc', 'Osaka');

-- Europe
-- Germany
INSERT INTO state(state_id, country_id, name) VALUES('f8b9e1d2-7c3e-4b8f-9e5d-2c8e7d6f1234', 'e31b4b47-c3e6-46e1-94ec-3f5a1b042f4b', 'Bavaria');
INSERT INTO state(state_id, country_id, name) VALUES('d5e9f2c3-4b7d-4c8e-9d3e-5b8c6d9e1234', 'e31b4b47-c3e6-46e1-94ec-3f5a1b042f4b', 'Berlin');

-- France
INSERT INTO state(state_id, country_id, name) VALUES('e7f9c1d2-4b7e-4a8f-9d5c-6a8b7e2f1234', 'd70f6c8a-0b87-4b64-9d36-cb39c732f7c5', 'Île-de-France');
INSERT INTO state(state_id, country_id, name) VALUES('a8c9d1e2-5b8f-4d6c-9e7b-4f3d2e1f1234', 'd70f6c8a-0b87-4b64-9d36-cb39c732f7c5', 'Provence-Alpes-Côte dAzur');

-- Italy
INSERT INTO state(state_id, country_id, name) VALUES('b6e9f1d2-8c7d-4a8b-9e2d-3f5c6d7e1234', 'f6db7b60-c7f0-44de-b62e-d0a2d179dbf8', 'Lazio');
INSERT INTO state(state_id, country_id, name) VALUES('d9e7c2f1-4b8d-4a6f-9d3e-5b8c6d7e1234', 'f6db7b60-c7f0-44de-b62e-d0a2d179dbf8', 'Veneto');

-- North America
-- United States
INSERT INTO state(state_id, country_id, name) VALUES('a5b8e9d2-4f9c-4a8d-9b6e-7c8e5d9f1234', '72a0a546-6d85-4b84-9e41-f8d8b97a63e0', 'California');
INSERT INTO state(state_id, country_id, name) VALUES('d1e9c5b7-8f9a-4d6c-9e3b-2c7f8d0e1234', '72a0a546-6d85-4b84-9e41-f8d8b97a63e0', 'New York');

-- Canada
INSERT INTO state(state_id, country_id, name) VALUES('e1b7f0c2-4d8e-4a7d-9b6c-5e8f2d3a1234', '9176f0b6-6f23-4690-ae12-2b67d3c27f26', 'Ontario');
INSERT INTO state(state_id, country_id, name) VALUES('a9b5c8d7-4e6f-4a8b-9d3e-2c7f8e0a1234', '9176f0b6-6f23-4690-ae12-2b67d3c27f26', 'British Columbia');

-- Mexico
INSERT INTO state(state_id, country_id, name) VALUES('b8d7e1c2-4f9d-4a8f-9e3b-6c5e8d2f1234', 'f6232f4c-2ea0-4c2b-bd5c-b1b9b35d65c7', 'CDMX');
INSERT INTO state(state_id, country_id, name) VALUES('d2e9f5b7-4a8c-4b6d-9e3b-8c7f0d2e1234', 'f6232f4c-2ea0-4c2b-bd5c-b1b9b35d65c7', 'Jalisco');

-- Oceania
-- Australia
INSERT INTO state(state_id, country_id, name) VALUES('b7d8e1c3-4a9e-4b8d-9c5e-6a8b7d9e1234', 'bc85b7b7-4c58-42b2-9f3d-60b2186b1d7d', 'New South Wales');
INSERT INTO state(state_id, country_id, name) VALUES('a6b9e2d3-4c8f-4a7d-9e3b-5f8c7d0e1234', 'bc85b7b7-4c58-42b2-9f3d-60b2186b1d7d', 'Victoria');

-- New Zealand
INSERT INTO state(state_id, country_id, name) VALUES('d1e5f2c3-4a8e-4b7d-9b6c-5e8f7d2a1234', '8c9d5f95-0a84-41d5-87e8-d7f978f062f7', 'Auckland');
INSERT INTO state(state_id, country_id, name) VALUES('e9f8d3b7-4c6a-4b8e-9d3e-2b7f8d0e1234', '8c9d5f95-0a84-41d5-87e8-d7f978f062f7', 'Wellington');

-- Fiji
INSERT INTO state(state_id, country_id, name) VALUES('c2e5b9d3-4a7f-4b6c-9e8d-5a7f8d9e1234', 'd485d327-57d0-4c4a-bb6b-5920e7604d1b', 'Central Division');
INSERT INTO state(state_id, country_id, name) VALUES('a8d9f6c7-4b8e-4a7d-9c3e-2f5e8d9e1234', 'd485d327-57d0-4c4a-bb6b-5920e7604d1b', 'Western Division');

-- South America
-- Brazil
INSERT INTO state(state_id, country_id, name) VALUES('b5d8e9c3-4a6f-4b7d-9e2d-5c8f7d0e1234', '3c4e749f-6d2e-48b8-bd36-1b9d96e7a8d6', 'São Paulo');
INSERT INTO state(state_id, country_id, name) VALUES('d6e9f5b7-4a8c-4b9d-9e3b-2f7e8d0e1234', '3c4e749f-6d2e-48b8-bd36-1b9d96e7a8d6', 'Rio de Janeiro');

-- Argentina
INSERT INTO state(state_id, country_id, name) VALUES('b8c9d1e2-4f8a-4b6d-9e3b-7a5e8f9d1234', '64d1f23c-6a9c-4d8f-b26d-4e09892e7b8b', 'Buenos Aires');
INSERT INTO state(state_id, country_id, name) VALUES('d1e7f5b9-4a8c-4b6d-9e3b-2f8c7d0e1234', '64d1f23c-6a9c-4d8f-b26d-4e09892e7b8b', 'Córdoba');

-- Chile
INSERT INTO state(state_id, country_id, name) VALUES('b8c9d2e3-4f8a-4b7d-9e3b-7d5e8f9d1234', 'c9788e56-46c2-4f88-9a88-d7b5a6e6e8d0', 'Santiago');
INSERT INTO state(state_id, country_id, name) VALUES('d1e7f5b9-4a8c-4b6d-9e3b-8c7f2e0d1234', 'c9788e56-46c2-4f88-9a88-d7b5a6e6e8d0', 'Valparaíso');

-- Insert some Applications
-- Insert query for a financial tracking application
INSERT INTO application (application_id, seal_id, name, description, version) VALUES ('b5b35c8b-9e9b-4f3d-b8ab-2d1f7c72d573', 11111, 'FinanceTracker', 'A comprehensive app for tracking personal finances and investments.', '1.0.0');

INSERT INTO application (application_id, seal_id, name, description, version) VALUES ('e91dbe94-2e2a-4b1c-9c6e-9c63d0356b30', 11111, 'HealthMonitor', 'An application to monitor and manage your health metrics and fitness goals.', '1.2.3');

INSERT INTO application (application_id, seal_id, name, description, version) VALUES ('f3a5b4c2-5d6e-4f7b-8d9c-5b6a3d7c12c8', 11111, 'ProjectPulse', 'A tool for managing projects, tasks, and team collaboration.', '2.0.1');

INSERT INTO application (application_id, seal_id, name, description, version) VALUES ('a8d6c7a9-4e4a-4d7c-87b1-d84f1f3a6b24', 11111, 'TravelPlanner', 'An app designed to help users plan and organize their travel itineraries and accommodations.', '3.1.0');

INSERT INTO application (application_id, seal_id, name, description, version) VALUES ('b5c3d6e9-0f4a-4a3b-89c1-a8d3e4f5b2d6', 11111, 'LangMaster', 'An interactive application for learning and practicing new languages through various exercises.', '4.0.2');

INSERT INTO feature (feature_id, application_id, name, description, enabled) VALUES ('e9a1b5c6-3f4a-4b6c-8d9e-1f2a3b4c5d6e', 'b5b35c8b-9e9b-4f3d-b8ab-2d1f7c72d573', 'login_enabled', 'Feature to enable or disable login functionality.', true );
INSERT INTO feature (feature_id, application_id, name, description, enabled) VALUES ('f1a2b3c4-5d6e-7f8a-9b0c-1d2e3f4a5b6c', 'b5b35c8b-9e9b-4f3d-b8ab-2d1f7c72d573', 'reset_password', 'Feature to enable or disable password reset functionality.', true);
INSERT INTO feature (feature_id, application_id, name, description, enabled) VALUES ('a2b3c4d5-6e7f-8a9b-0c1d-2e3f4a5b6c7d', 'b5b35c8b-9e9b-4f3d-b8ab-2d1f7c72d573', 'update_profile', 'Feature to enable or disable profile update functionality.', true);